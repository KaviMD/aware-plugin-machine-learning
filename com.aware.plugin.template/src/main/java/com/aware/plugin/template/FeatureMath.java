package com.aware.plugin.template;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import java.lang.Math;

public class FeatureMath {
    public static double Sum(double[] doubles) {
        int total = 0;
        for (int i = 0; i < doubles.length; total += doubles[i++]);
        return total;
    }
    public static double Mean(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }
    public static double STD(double[] data) {
        StandardDeviation stdev = new StandardDeviation();
        return stdev.evaluate(data);
    }

    public static double Energy(double[] data, int winSize) {
        double sum = 0.0;
        double[] dataFixed;
        if((data.length & (data.length- 1)) != 0) {
            dataFixed = new double[data.length+1];
            for(int i=0;i<data.length;i++) {
                dataFixed[i] = data[i];
            }
        } else {
            dataFixed = data;
        }
        FastFourierTransformer FFT = new FastFourierTransformer(DftNormalization.STANDARD);
        Complex[] result = FFT.transform(dataFixed, TransformType.FORWARD);
        for (int i=0; i<result.length;i++){
            double real = result[i].getReal();
            double imaginary = result[i].getImaginary();
            sum = sum + Math.pow(real,2);
            sum = sum - Math.pow(imaginary,2);
        }
        return sum/winSize; // 63
    }

    public static double Correlation(double[] x,double[] y){
        PearsonsCorrelation PC = new PearsonsCorrelation();
        return ((PC.correlation(x,y)*2)+(2))/4;
    }
}

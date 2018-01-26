package com.aware.plugin.template;
import org.jtransforms.fft.DoubleFFT_1D;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import java.lang.Math;
import java.util.Arrays;

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
        double[] data2 = new double[data.length*2];
        for(int i=0;i<data2.length;i++){
            if(i<data.length){
                data2[i] = data[i];
            }
            else{
                data2[i] = 0;
            }
        }
        double sum = 0.0;
        DoubleFFT_1D fftCl = new DoubleFFT_1D(data.length);
        fftCl.realForwardFull(data2);
        System.out.println(Arrays.toString(data2));
        for (int i=0; i<data2.length;i++){
            if(i%2 == 0){
                sum = sum + Math.pow(data2[i],2);
            } else {
                sum = sum - Math.pow(data2[i],2);
            }
            System.out.println(sum);
        }
        return sum/winSize; // winSize should be 63
    }
    public static double Correlation(double[] x,double[] y){
        PearsonsCorrelation PC = new PearsonsCorrelation();
        return ((PC.correlation(x,y)*2)+(2))/4;
    }
}

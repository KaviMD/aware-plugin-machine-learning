package com.aware.plugin.template;
import org.jtransforms.fft.DoubleFFT_1D;
import java.lang.Math;
import android.util.Log;
//import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

/**
 * Created by kavidey on 1/5/18.
 */

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
        double mean = Mean(data);
        for(int i = 0; i < data.length; i++){
            data[i] = Math.pow((data[i]-mean),2);
        }
        return Math.sqrt(Sum(data));
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
        Log.i("data.length",String.valueOf(data2.length));
        DoubleFFT_1D fftCl = new DoubleFFT_1D(data.length);
        fftCl.realForwardFull(data2);
        for (int i=1; i<data2.length;i++){
            sum = sum + Math.pow(data2[i],2);
        }
        return sum/winSize; // 63
    }
    public static double Correlation(double[] x,double[] y){
        // Save the x and y means in variables
        double xMean = Mean(x);
        double yMean = Mean(y);

        // Create empty variables to store the numerator and denominator
        double numerator = 0;
        double denominator = 0;

        // Calculate the numerator
        for(int i = 0;i < x.length;i++) {
            numerator =+ (x[i]-xMean)*(y[i]-yMean);
        }

        // Calculate the denominator
        double xSum = 0;
        double ySum = 0;
        for(int i = 0;i < x.length;i++){
            xSum =+ x[i]-xMean;
        }
        xSum = Math.pow(xSum,2);
        for(int i = 0;i < x.length;i++) {
            ySum = +y[i] - yMean;
        }
        ySum = Math.pow(ySum,2);
        denominator = xSum*ySum;
        //PearsonsCorrelation corr = new PearsonsCorrelation();
        //return corr.correlation(x, y);
        return denominator;
    }
}

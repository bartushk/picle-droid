package net.android.bartushk.picle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.bartushk.picle.Filter.*;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("opencv_java3");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path = net.bartushk.picle.Program.class.getResource("/images/cat1.jpeg").getPath();
        IFilter filter = new ColorFilter();
        Mat img = Imgcodecs.imread(path);
        Mat filtered = filter.applyFilter(img);
    }
}

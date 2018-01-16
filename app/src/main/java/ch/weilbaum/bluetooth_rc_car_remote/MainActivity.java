package ch.weilbaum.bluetooth_rc_car_remote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private SeekBar speed;
    private SeekBar steering;
    // private Bluetooth bt;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        speed = (SeekBar) findViewById(R.id.speed);
        speed.setMax(130);
        speed.setProgress(30);

        steering = (SeekBar) findViewById(R.id.steering);
        steering.setProgress(50);

        speed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.d("SPEED", Integer.toString(seekBar.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBar.setProgress(30);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
        });


        steering.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.d("STEERING", Integer.toString(seekBar.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBar.setProgress(50);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
        });

        /*
        button.setOnClickListener((View v) -> {
            try {
                bt.getListOfPairedDevices();
            } catch (Exception e) {
                Log.e("BT", e.toString());
            }
        });
        */
    }
}

package jp.netplan.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class VolumeTestActivity extends Activity {
	
    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;
    TextView value1;
    TextView value2;
    TextView value3;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        
        seekBar1 = (SeekBar)findViewById(R.id.item1SeekBar);
        seekBar2 = (SeekBar)findViewById(R.id.item2SeekBar);
        seekBar3 = (SeekBar)findViewById(R.id.item3SeekBar);
        value1 = (TextView)findViewById(R.id.item1value);
        value2 = (TextView)findViewById(R.id.item2Value);
        value3 = (TextView)findViewById(R.id.item3Value);

        // �V�[�N�o�[�̏����l��TextView�ɕ\��
        value1.setText(String.valueOf(seekBar1.getProgress()));
        value2.setText(String.valueOf(seekBar2.getProgress()));
        value3.setText(String.valueOf(seekBar3.getProgress())); 

         seekBar1.setOnSeekBarChangeListener(
 
                new OnSeekBarChangeListener() {
                    public void onProgressChanged(SeekBar seekBar,
                            int progress, boolean fromUser) {
                        // �c�}�~���h���b�O�����Ƃ��ɌĂ΂��
                        value1.setText(String.valueOf(progress));
                    }
 
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�ɐG�ꂽ�Ƃ��ɌĂ΂��
                    }
 
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�𗣂����Ƃ��ɌĂ΂��
                    }
                }
        );
        seekBar2.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener() {
                    public void onProgressChanged(SeekBar seekBar,
                            int progress, boolean fromUser) {
                        // �c�}�~���h���b�O�����Ƃ��ɌĂ΂��
                        value2.setText(String.valueOf(progress));
                    }
 
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�ɐG�ꂽ�Ƃ��ɌĂ΂��
                    }
 
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�𗣂����Ƃ��ɌĂ΂��
                    }
                }
        );
        seekBar3.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener() {
                    public void onProgressChanged(SeekBar seekBar,
                            int progress, boolean fromUser) {
                        // �c�}�~���h���b�O�����Ƃ��ɌĂ΂��
                        value3.setText(String.valueOf(progress));
                    }
 
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�ɐG�ꂽ�Ƃ��ɌĂ΂��
                    }
 
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // �c�}�~�𗣂����Ƃ��ɌĂ΂��
                    }
                }
        );

    }
}
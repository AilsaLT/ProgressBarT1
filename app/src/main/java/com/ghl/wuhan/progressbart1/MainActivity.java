package com.ghl.wuhan.progressbart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pogressBar;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pogressBar = (ProgressBar)findViewById(R.id.progress_Bar);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
//                        if(pogressBar.getVisibility()==View.GONE){
//                            pogressBar.setVisibility(View.VISIBLE);
//                        }else{
//                            pogressBar.setVisibility(View.GONE);
//                        }
                        //动态地更改进度条的进度
                        int progress = pogressBar.getProgress();
                        progress = progress+10;
                        pogressBar.setProgress(progress);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}

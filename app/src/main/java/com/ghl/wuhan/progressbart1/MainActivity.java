package com.ghl.wuhan.progressbart1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
                         // 静态显示进度条
//                        if(pogressBar.getVisibility()==View.GONE){
//                            pogressBar.setVisibility(View.VISIBLE);
//                        }else{
//                            pogressBar.setVisibility(View.GONE);
//                        }

                        //动态地更改进度条的进度
//                        int progress = pogressBar.getProgress();
//                        progress = progress+10;
//                        pogressBar.setProgress(progress);

                        //AlerDialog
                        // 可以在当前的界面弹出一个对话框，这个对话框是置顶于所有界面元素之上的，
                        //能够屏蔽掉其他控件的交互能力，因此AlerDialog一般都是用于提示一些非常重要的内容或者警告信息
                        //比如为了防止用户误删重要内容，在删除前弹出一个确认对话框。
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is Dialog");
                        dialog.setMessage("Something important.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });

    }
}

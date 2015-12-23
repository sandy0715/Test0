package com.example.sandy.test0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //onCreate: アクティビティが起動した時に呼ばれる
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //LayoutのActivityMainを上位のViewに表示
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // burstUnko buttonのonClickメソッド
    public void burstUnko(View view) {
        // findView~ でViewから部品のIDを検索してくれる。IDはR.id.xxxで指定。findViewの戻り値はViewなのでキャストする。
        TextView tv = (TextView)findViewById(R.id.textTitle);

        // 現在時刻の取得：System.currentTimeMillis()
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);    // log:時刻出力
        int conditionSeed = (int)(currentTime%(long)4); // seed生成
        System.out.println(conditionSeed);    // log:seedの確認
        String text;    //表示テキストの宣言

        // 現在時刻から4種類のテキストをボタン押下時のタイミングで生成
        switch(conditionSeed) {
            case 0:
                text = "Banana unko";
                System.out.println("[Case 0]");    // log:
                break;
            case 1:
                text = "Geri";
                System.out.println("[Case 1]");    // log:
                break;
            case 2:
                text = "Ball unko";
                System.out.println("[Case 2]");    // log:
                break;
            case 3:
                text = "Cool MAKI-GUSO!!";
                System.out.println("[Case 3]");    // log:
                break;
            default:
                text = "";
                System.out.println("[Default]");    // log:
                break;
        }
        System.out.println("TEXT: " + text);    // log:textの確認
        // textの出力
        tv.setText(text);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

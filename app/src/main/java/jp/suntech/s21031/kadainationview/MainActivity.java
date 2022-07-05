package jp.suntech.s21031.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewオブジェクトの取得
        ListView NationList = findViewById(R.id.NationList);
        //ListViewにリスナを設定
        NationList.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String item = (String) parent.getItemAtPosition(position);
            TextView text = findViewById(R.id.textView);
            text.setText(item);
        }
    }
}
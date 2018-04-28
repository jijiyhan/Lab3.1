package com.example.ji.lab3_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtn; //버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = (Button)findViewById(R.id.button);
        registerForContextMenu(mBtn); //버튼에 contextMenu 기능 등록

    }

    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {   //메뉴 item 생성
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Button Menu");

        menu.add(0,1,0 ,"Red");
        menu.add(0,2,0,"Green");
        menu.add(0,3,0,"Blue");
    }


    public boolean onContextItemSelected (MenuItem item){
        switch (item.getItemId()) //itemID 선택에 따른 변화
        {
            case 1: //1번 택 > 빨간색 으로 text color 변함
                mBtn.setTextColor(Color.RED);
                return true;
            case 2: //2번 택 > 초록색 으로 text color 변함
                mBtn.setTextColor(Color.GREEN);
                return true;
            case 3: //3번 택 > 파란색 으로 text color 변함
                mBtn.setTextColor(Color.BLUE);
                return true;
        }

        return true;
    }

}


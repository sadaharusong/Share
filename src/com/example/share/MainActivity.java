package com.example.share;

import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	Button share_sina_but;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		share_sina_but = (Button) findViewById(R.id.button_share_sina);
		share_sina_but.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				OnekeyShare onekeyShare = new OnekeyShare();
				//���ñ���
				onekeyShare.setTitle("����һ��");
				//���ñ༭����
				onekeyShare.setText("�ٺٺ١� ���������  ������˾��");
				//����ͼ��
//				onekeyShare.setImagePath("");
				//����
				onekeyShare.show(MainActivity.this);
			}
		});
	}

	
}

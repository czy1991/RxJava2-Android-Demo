package com.rxjava2.android.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rxjava2.android.samples.MyApplication;
import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.ui.compose.ComposeOperatorExampleActivity;
import com.rxjava2.android.samples.ui.networking.NetworkingActivity;
import com.rxjava2.android.samples.ui.pagination.PaginationActivity;
import com.rxjava2.android.samples.ui.rxbus.RxBusActivity;
/**
 * 类 `${CLASS_NAME}`
 *
 *
 * 描述：
 *
 * 创建日期：2017年11月15日
 *
 * @author zhaoyong.chen@ehking.com
 * @version 1.0
 */
public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void startOperatorsActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, OperatorsActivity.class));
    }

    public void startNetworkingActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, NetworkingActivity.class));
    }

    public void startRxBusActivity(View view) {
        ((MyApplication) getApplication()).sendAutoEvent();
        startActivity(new Intent(SelectionActivity.this, RxBusActivity.class));
    }

    public void startPaginationActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, PaginationActivity.class));
    }

    public void startComposeOperator(View view) {
        startActivity(new Intent(SelectionActivity.this, ComposeOperatorExampleActivity.class));
    }
}

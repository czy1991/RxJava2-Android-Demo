package com.rxjava2.android.samples.ui.compose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rxjava2.android.samples.R;

import io.reactivex.Flowable;
import io.reactivex.Observable;
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
public class ComposeOperatorExampleActivity extends AppCompatActivity {

    private RxSchedulers schedulers = new RxSchedulers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_operator_example);

        /*
            Compose for reusable code.
         */
        Observable.just(1, 2, 3, 4, 5)
                .compose(schedulers.<Integer>applyObservableAsync())
                .subscribe(/* */);

        Flowable.just(1, 2, 3, 4, 5)
                .compose(schedulers.<Integer>applyFlowableAsysnc())
                .subscribe(/* */);

    }
}

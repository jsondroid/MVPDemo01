package jsondroid.android.com.modeldemo01.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import jsondroid.android.com.modeldemo01.base.BasePresenter;
import jsondroid.android.com.modeldemo01.base.IBaseView;


/**
 * Created by wenbaohe on 2018/6/15.
 * UI基类
 */

public abstract class BaseActivity<V extends IBaseView, P extends BasePresenter<V>> extends AppCompatActivity {

    protected P presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter= initPresenter();
        presenter.bindView((V) this);
    }
    protected abstract P initPresenter();
}

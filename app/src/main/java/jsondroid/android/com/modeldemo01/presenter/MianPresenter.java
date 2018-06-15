package jsondroid.android.com.modeldemo01.presenter;

import android.content.Context;
import android.util.Log;

import jsondroid.android.com.modeldemo01.base.BasePresenter;
import jsondroid.android.com.modeldemo01.model.ModelIml;

/**
 * Created by wenbaohe on 2018/6/15.
 * 业务逻辑层
 */

public class MianPresenter extends BasePresenter<IContract.MainView> implements IContract.IMainIm, IContract.IModelPresenter {
    protected Context mContext;

    protected ModelIml modelIml;

    public MianPresenter(Context mContext) {
        this.mContext = mContext;
        modelIml = new ModelIml(this);
    }

    @Override
    public void oncreat() {
        Log.e("测试数据---", "oncreat");
    }

    @Override
    public void onresume() {
        Log.e("测试数据---", "onresume");
    }

    @Override
    public void onstart() {
        Log.e("测试数据---", "onstart");
    }

    @Override
    public void onstop() {
        Log.e("测试数据---", "onstop");
    }

    @Override
    public void onpus() {
        Log.e("测试数据---", "onpus");
    }

    @Override
    public void ondestry() {
        Log.e("测试数据---", "ondestry");
    }


    /**请求数据*/
    @Override
    public void getData(int requst) {
        modelIml.getdata(requst);
    }

    /**model获取到数据后返回给P层然后在通过P层返回给View*/
    @Override
    public void onResphone(int resdata) {
        view.onRefresh(resdata);
    }
}


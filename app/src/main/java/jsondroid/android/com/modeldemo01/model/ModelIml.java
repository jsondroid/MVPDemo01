package jsondroid.android.com.modeldemo01.model;

import jsondroid.android.com.modeldemo01.presenter.IContract;

/**
 * Created by wenbaohe on 2018/6/15.
 *
 * Model层负责加载数据
 */

public class ModelIml implements IModel{

    IContract.IModelPresenter presenter;

    public ModelIml(IContract.IModelPresenter presenter) {
        this.presenter = presenter;
    }

    /**加载数据*/
    @Override
    public void getdata(final int requstdata) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int coum=requstdata+20;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                presenter.onResphone(coum);
            }
        }).start();
    }
}

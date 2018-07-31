package com.haoqi.tech.pattern.proxy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class WangPo implements KindWomen {

   private KindWomen kindWomen;

   public WangPo() {
       this.kindWomen = new PanJinLian();
   }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {

       this.kindWomen.happyWithMan();
    }
}

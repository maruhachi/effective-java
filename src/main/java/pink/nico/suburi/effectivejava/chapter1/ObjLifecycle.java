package pink.nico.suburi.effectivejava.chapter1;

import java.util.List;

/**
 * @author ykonno
 * @since 2017/05/24.
 */
public class ObjLifecycle {

    public int section1(List<String> argList){
        // staticファクトリーメソッドを使う
        return 11;
    }

    public int section2(List<String> argList){
        // 2節のお題
        return 12;
    }

}
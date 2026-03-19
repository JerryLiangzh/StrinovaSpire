package StrinovaMod;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.core.Settings.GameLanguage;
import com.megacrit.cardcrawl.localization.CardStrings;

import StrinovaMod.cards.XingHui.BeiJiXing;
import basemod.BaseMod;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditStringsSubscriber;

@SpireInitializer // 加载mod的注解
public class StrinovaMod implements EditCardsSubscriber, EditStringsSubscriber {
    public static final String MOD_ID = "StrinovaMod";

    // 构造方法
    public StrinovaMod() {
        BaseMod.subscribe(this); // 告诉basemod你要订阅事件
    }

    // 注解需要调用的方法，必须写
    public static void initialize() {
        new StrinovaMod();
    }

    // 当basemod开始注册mod卡牌时，便会调用这个函数
    @Override
    public void receiveEditCards() {
        // 这里写添加你卡牌的代码
        BaseMod.addCard(new BeiJiXing());
    }

    public static String assetPath(String string) {
        return MOD_ID + "/images/" + string;
    }

    public static String makeID(String string) {
        return MOD_ID + ":" + string;
    }

    @Override
    public void receiveEditStrings() {
        String lang;
        if (Settings.language == GameLanguage.ZHS) {
            lang = "zhs"; // 如果语言设置为简体中文，则加载ZHS文件夹的资源
        } else {
            lang = "eng"; // 如果没有相应语言的版本，默认加载英语
        }
        BaseMod.loadCustomStringsFile(CardStrings.class, "StrinovaMod/localization/" + lang + "/cards.json"); // 加载相应语言的卡牌本地化内容
    }
}
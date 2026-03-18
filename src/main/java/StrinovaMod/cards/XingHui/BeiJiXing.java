package StrinovaMod.cards.XingHui;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import StrinovaMod.StrinovaMod;
import basemod.abstracts.CustomCard;

public class BeiJiXing extends CustomCard {
    public static final String ID = "StrinovaMod:BeiJiXing";
    private static final String NAME = "星绘的北极星";
    public static final String IMG = StrinovaMod.assetPath("/images/cards/XingHui/BeiJiXing.png");
    private static final int COST = 1;
    private static final String DESCRIPTION = "造成 6 点伤害。";
    private static final CardType TYPE = CardType.ATTACK;
    private static final CardColor COLOR = CardColor.GREEN;
    private static final CardRarity RARITY = CardRarity.BASIC;
    private static final CardTarget TARGET = CardTarget.ENEMY;

    public BeiJiXing() {
        // 为了命名规范修改了变量名。这些参数具体的作用见下方
        super(ID, NAME, IMG, COST, DESCRIPTION, TYPE, COLOR, RARITY, TARGET);
    }

    @Override
    public void upgrade() {
        
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
    }
    
}

package BattleTimer.mechanics;;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class DrawMonsterTimer {
    public static float hbYOffset = 60 * Settings.scale;
    public static float HEALTH_BAR_HEIGHT = 20.0F * Settings.scale;
    public static float HEALTH_BAR_OFFSET_Y = -28.0F * Settings.scale;

    public static void drawMonsterTimer(SpriteBatch sb, AbstractMonster __instance, float currentTimer, float maxTimer){
        float x = __instance.hb.cX - __instance.hb.width / 2.0F;
        float y = __instance.hb.cY - __instance.hb.height / 2.0F - (0 * hbYOffset);
        float timerBarWidth = __instance.hb.width * currentTimer / maxTimer;
        sb.setColor(Color.YELLOW);
        sb.draw(ImageMaster.HEALTH_BAR_L, x - HEALTH_BAR_HEIGHT, y, HEALTH_BAR_HEIGHT, HEALTH_BAR_HEIGHT);
        sb.draw(ImageMaster.HEALTH_BAR_B, x, y, timerBarWidth, HEALTH_BAR_HEIGHT);
        sb.draw(ImageMaster.HEALTH_BAR_R, x + timerBarWidth, y, HEALTH_BAR_HEIGHT, HEALTH_BAR_HEIGHT);
    }
}

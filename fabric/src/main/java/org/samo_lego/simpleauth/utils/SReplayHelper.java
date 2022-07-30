package org.samo_lego.simpleauth.utils;

import net.minecraft.entity.player.PlayerEntity;
import com.hadroncfy.sreplay.recording.Photographer;

public class SReplayHelper {
    /**
     * Checks if player is actually a fake one.
     *
     * @param player player to check
     * @return true if it's fake, otherwise false
     */
    public static boolean isPlayerFake(PlayerEntity player) {
        return player instanceof Photographer;
    }
}

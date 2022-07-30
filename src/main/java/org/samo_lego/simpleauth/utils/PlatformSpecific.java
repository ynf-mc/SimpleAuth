package org.samo_lego.simpleauth.utils;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.player.PlayerEntity;
import org.samo_lego.simpleauth.SimpleAuth;

public class PlatformSpecific {
    /**
     * Checks if player is actually a fake one.
     *
     * @param player player to check
     * @return true if it's fake, otherwise false
     */
    public static boolean isPlayerFake(PlayerEntity player) {
        boolean isFake = isCarpetFake(player) || isSReplayFake(player);
        return isFake;
    }

    private static boolean isCarpetFake(PlayerEntity player) {
        return FabricLoader.getInstance().isModLoaded("carpet") && CarpetHelper.isPlayerFake(player);
    }

    private static boolean isSReplayFake(PlayerEntity player) {
        return FabricLoader.getInstance().isModLoaded("sreplay") && SReplayHelper.isPlayerFake(player);
    }
}

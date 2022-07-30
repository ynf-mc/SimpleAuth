package org.samo_lego.simpleauth.utils.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.player.PlayerEntity;
import org.samo_lego.simpleauth.utils.CarpetHelper;
import org.samo_lego.simpleauth.utils.SReplayHelper;

public class PlatformSpecificImpl {
    /**
     * Checks if player is actually a fake one.
     *
     * @param player player to check
     * @return true if it's fake, otherwise false
     */
    public static boolean isPlayerFake(PlayerEntity player) {
        return isCarpetFake(player) || isSReplayFake(player);
    }

    private static boolean isCarpetFake(PlayerEntity player) {
        return FabricLoader.getInstance().isModLoaded("carpet") && CarpetHelper.isPlayerFake(player);
    }

    private static boolean isSReplayFake(PlayerEntity player) {
        return FabricLoader.getInstance().isModLoaded("sreplay") && SReplayHelper.isPlayerFake(player);
    }
}

package com.sabakachabaka.miscellaneousmod.screens;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.sabakachabaka.miscellaneousmod.containers.BackpackContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BackpackScreen extends ContainerScreen<BackpackContainer> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation("minecraft",
                    "textures/gui/container/generic_54.png");

    public BackpackScreen(BackpackContainer screenContainer,
                          PlayerInventory inv,
                          ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);

        this.imageHeight = 168;  // высота для 3 рядов
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    protected void init() {
        super.init();
        this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(MatrixStack matrixStack, float partialTicks, int x, int y) {
        Minecraft.getInstance().getTextureManager().bind(TEXTURE);

        int startX = (this.width - this.imageWidth) / 2;
        int startY = (this.height - this.imageHeight) / 2;

        // Верх (3 ряда)
        this.blit(matrixStack, startX, startY,
                0, 0,
                this.imageWidth, 71);

        // Низ (инвентарь игрока)
        this.blit(matrixStack, startX, startY + 71,
                0, 126,
                this.imageWidth, 96);
    }
}
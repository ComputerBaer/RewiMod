/*
 * RewiMod, a Minecraft Client Enhancement
 * Copyright (C) rewinside.tv <https://rewinside.tv/>
 * Copyright (C) RewiMod team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.rewinside.rewimod.forge.gui.objects;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import tv.rewinside.rewimod.core.gui.CoreGuiActions;
import tv.rewinside.rewimod.core.gui.CoreGuiDrawer;
import tv.rewinside.rewimod.core.gui.objects.IGuiButton;
import tv.rewinside.rewimod.core.util.CoordinateUtil;

public class GuiTwitterButton extends GuiButton implements IGuiButton {

	public GuiTwitterButton(int buttonID, int x, int y) {
		super(buttonID, x, y, 20, 20, "");
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		CoreGuiDrawer.drawButtonTwitter(this, this.visible, this.xPosition, this.yPosition, mouseX, mouseY, this.width, this.height);

		if (CoordinateUtil.inbetween(xPosition, yPosition, mouseX, mouseY, width, height)) {
			this.drawString(mc.fontRendererObj, "Twitter", this.xPosition + 24, this.yPosition + 6, Color.WHITE.getRGB());
		}
	}

	@Override
	public void onClick(int mouseButton) {
		CoreGuiActions.clickButtonTwitter();
	}

}

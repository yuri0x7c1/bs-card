/*
 * Copyright 2021-2022 yuri0x7c1
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.vaadin.addons.yuri0x7c1.bscard;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 *
 * @author yuri0x7c1
 *
 */
@Tag("bs-card")
@JsModule("./bs-card/bs-card.js")
public class BsCard extends Component implements HasComponents, HasSize, HasStyle {
	private final BsCardImg topImage = new BsCardImg();
	private final BsCardHeader header = new BsCardHeader();
	private final BsCardBody body = new BsCardBody();
	private final BsCardFooter footer = new BsCardFooter();
	private final BsCardImg bottomImage = new BsCardImg();

	public BsCard() {
		topImage.setVisible(false);
		topImage.getElement().setAttribute("slot", "top-image");
		getElement().appendChild(topImage.getElement());

		header.setVisible(false);
		getElement().appendChild(header.getElement());

		getElement().appendChild(body.getElement());

		footer.setVisible(false);
		getElement().appendChild(footer.getElement());

		bottomImage.setVisible(false);
		bottomImage.getElement().setAttribute("slot", "bottom-image");
		getElement().appendChild(bottomImage.getElement());
	}

	@Override
	public void add(Component... components) {
		body.add(components);
	}

	@Override
	public void remove(Component... components) {
		body.remove(components);
	}

	public void addTopImageComponent(Component c) {
		topImage.add(c);
		topImage.setVisible(true);
	}

	public void removeTopImageComponent(Component c) {
		topImage.remove(c);
		if (topImage.getChildren().count() == 0) {
			topImage.setVisible(false);
		}
	}

	public void addHeaderComponent(Component c) {
		header.add(c);
		header.setVisible(true);
	}

	public void removeHeaderComponent(Component c) {
		header.remove(c);
		if (header.getChildren().count() == 0) {
			header.setVisible(false);
		}
	}

	public void addTitleComponent(Component c) {
		body.addTitleComponent(c);
	}

	public void removeTitleComponent(Component c) {
		body.removeTitleComponent(c);
	}

	public void addSubtitleComponent(Component c) {
		body.addSubtitleComponent(c);
	}

	public void removeSubtitleComponent(Component c) {
		body.removeSubtitleComponent(c);
	}

	public void addTextComponent(Component c) {
		body.addTextComponent(c);
	}

	public void removeTextComponent(Component c) {
		body.removeTextComponent(c);
	}

	public void addFooterComponent(Component c) {
		footer.add(c);
		footer.setVisible(true);
	}

	public void removeFooterComponent(Component c) {
		footer.remove(c);
		if (footer.getChildren().count() == 0) {
			footer.setVisible(false);
		}
	}

	public void addBottomImageComponent(Component c) {
		bottomImage.add(c);
		bottomImage.setVisible(true);
	}

	public void removeBottomImageComponent(Component c) {
		bottomImage.remove(c);
		if (bottomImage.getChildren().count() == 0) {
			bottomImage.setVisible(false);
		}
	}

	public BsCard withComponents(Component...components) {
		add(components);
		return this;
	}

	public BsCard withTopImageComponent(Component c) {
		addTopImageComponent(c);
		return this;
	}

	public BsCard withHeaderComponent(Component c) {
		addHeaderComponent(c);
		return this;
	}

	public BsCard withTitleComponent(Component c) {
		addTitleComponent(c);
		return this;
	}

	public BsCard withSubtitleComponent(Component c) {
		addSubtitleComponent(c);
		return this;
	}

	public BsCard withTextComponent(Component c) {
		addTextComponent(c);
		return this;
	}

	public BsCard withFooterComponent(Component c) {
		addFooterComponent(c);
		return this;
	}

	public BsCard withBottomImageComponent(Component c) {
		withBottomImageComponent(c);
		return this;
	}
}

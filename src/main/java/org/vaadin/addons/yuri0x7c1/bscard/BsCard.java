package org.vaadin.addons.yuri0x7c1.bscard;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("bs-card")
@JsModule("./bs-card/bs-card.js")
public class BsCard extends Component implements HasComponents, HasSize {
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

	public void addToTopImage(Component c) {
		topImage.add(c);
		topImage.setVisible(true);
	}

	public void removeFromTopImage(Component c) {
		topImage.remove(c);
		if (topImage.getChildren().count() == 0) {
			topImage.setVisible(false);
		}
	}

	public void addToHeader(Component c) {
		header.add(c);
		header.setVisible(true);
	}

	public void removeFromHeader(Component c) {
		header.remove(c);
		if (header.getChildren().count() == 0) {
			header.setVisible(false);
		}
	}

	public void addToTitle(Component c) {
		body.addToTitle(c);
	}

	public void removeFromTitle(Component c) {
		body.removeFromTitle(c);
	}

	public void addToSubtitle(Component c) {
		body.addToSubtitle(c);
	}

	public void removeFromSubtitle(Component c) {
		body.removeFromSubtitle(c);
	}

	public void addToText(Component c) {
		body.addToText(c);
	}

	public void removeFromText(Component c) {
		body.removeFromText(c);
	}

	public void addToFooter(Component c) {
		footer.add(c);
		footer.setVisible(true);
	}

	public void removeFromFooter(Component c) {
		footer.remove(c);
		if (footer.getChildren().count() == 0) {
			footer.setVisible(false);
		}
	}

	public void addToBottomImage(Component c) {
		bottomImage.add(c);
		bottomImage.setVisible(true);
	}

	public void removeFromBottomImage(Component c) {
		bottomImage.remove(c);
		if (bottomImage.getChildren().count() == 0) {
			bottomImage.setVisible(false);
		}
	}
}

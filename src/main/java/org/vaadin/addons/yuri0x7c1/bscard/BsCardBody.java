package org.vaadin.addons.yuri0x7c1.bscard;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("bs-card-body")
@JsModule("./bs-card/bs-card-body.js")
public class BsCardBody extends Component implements HasComponents {
	public void addToTitle(Component c) {
		c.getElement().setAttribute("slot", "card-title");
		getElement().appendChild(c.getElement());
	}

	public void removeFromTitle(Component c) {
		getElement().removeChild(c.getElement());
	}

	public void addToSubtitle(Component c) {
		c.getElement().setAttribute("slot", "card-subtitle");
		getElement().appendChild(c.getElement());
	}

	public void removeFromSubtitle(Component c) {
		getElement().removeChild(c.getElement());
	}

	public void addToText(Component c) {
		c.getElement().setAttribute("slot", "card-text");
		getElement().appendChild(c.getElement());
	}

	public void removeFromText(Component c) {
		getElement().removeChild(c.getElement());
	}
}

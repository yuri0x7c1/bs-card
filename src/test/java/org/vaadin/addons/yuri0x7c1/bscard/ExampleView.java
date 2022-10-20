package org.vaadin.addons.yuri0x7c1.bscard;

import org.vaadin.addons.yuri0x7c1.bscard.BsCard;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/** Test view for manual and automated testing of the component.
 *
 */
@Route("")
public class ExampleView extends VerticalLayout {

    public ExampleView() {
    	BsCard card = new BsCard();
    	card.setWidth("600px");
    	card.addToTopImage(new Image("https://via.placeholder.com/600x200", "600x200"));
    	card.addToHeader(new HorizontalLayout(new Paragraph("Header"), new Button("Click Me!")));
    	card.addToTitle(new H5("Card Title"));
    	card.addToSubtitle(new H6("Card Subtitle"));
    	card.addToText(new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce venenatis tristique libero, sit amet auctor eros tempus ac. Mauris justo sapien, aliquet a varius eu, elementum eget urna. Donec maximus finibus ullamcorper. Nunc eu cursus justo. Aliquam cursus sem ut eros ullamcorper, eget varius felis tincidunt. Phasellus placerat felis et leo efficitur eleifend. Sed a lectus erat. Etiam eget iaculis erat. Morbi quis congue ligula. Integer lacinia diam dui, sit amet laoreet dui viverra rhoncus. Maecenas sollicitudin, turpis eget gravida rhoncus, eros est elementum dui, et efficitur est libero id leo. Nunc sed ornare erat. Duis felis lectus, tincidunt vitae est convallis, suscipit lacinia ex."));
    	card.add(new Button("Click Me!"));
    	card.addToFooter(new HorizontalLayout(new Paragraph("Footer"), new Button("Click Me!")));
    	card.addToBottomImage(new Image(" https://via.placeholder.com/600x200", "600x200"));
    	add(card);
    }
}

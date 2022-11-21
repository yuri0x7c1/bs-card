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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InputStreamFactory;
import com.vaadin.flow.server.StreamResource;

/** Test view for manual and automated testing of the component.
 *
 */
@Route("")
public class ExampleView extends VerticalLayout {

	private static final String _600X200 = "600x200";

	public class MyImageStreamFactory implements InputStreamFactory {
	    ByteArrayOutputStream imagebuffer = null;

	    // This method generates the stream contents
	    public InputStream createInputStream () {
	        // Create an image
	        BufferedImage image = new BufferedImage (600, 200,
	                                  BufferedImage.TYPE_INT_RGB);
	        Graphics2D drawable = image.createGraphics();

	        // fill background
	        drawable.setStroke(new BasicStroke(5));
	        drawable.setColor(Color.GRAY);
	        drawable.fillRect(0, 0, 600, 200);

	        // draw text
	        drawable.setColor(Color.BLACK);
	        drawable.setFont(new Font("Montserrat",
	                                  Font.PLAIN, 48));
	        drawable.drawString(_600X200, 175, 120);
	        try {
	            // Write the image to a buffer
	            imagebuffer = new ByteArrayOutputStream();
	            ImageIO.write(image, "png", imagebuffer);

	            // Return a stream from the buffer
	            return new ByteArrayInputStream(
	                imagebuffer.toByteArray());
	        } catch (IOException e) {
	            return null;
	        }
	    }
	}

    public ExampleView() {
    	StreamResource imageResource = new StreamResource(_600X200, new MyImageStreamFactory());

    	BsCard card = new BsCard();
    	card.setWidth("600px");
    	card.addTopImageComponent(new Image(imageResource, _600X200));
    	card.addHeaderComponent(new HorizontalLayout(new Paragraph("Header"), new Button("Click Me!")));
    	card.addTitleComponent(new H5("Card Title"));
    	card.addSubtitleComponent(new H6("Card Subtitle"));
    	card.addTextComponent(new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce venenatis tristique libero, "
    			+ "sit amet auctor eros tempus ac. Mauris justo sapien, aliquet a varius eu, elementum eget urna. Donec maximus "
    			+ "finibus ullamcorper. Nunc eu cursus justo. Aliquam cursus sem ut eros ullamcorper, eget varius felis tincidunt. "
    			+ "Phasellus placerat felis et leo efficitur eleifend. Sed a lectus erat. Etiam eget iaculis erat. Morbi quis "
    			+ "congue ligula. Integer lacinia diam dui, sit amet laoreet dui viverra rhoncus. Maecenas sollicitudin, turpis "
    			+ "eget gravida rhoncus, eros est elementum dui, et efficitur est libero id leo. Nunc sed ornare erat. Duis felis "
    			+ "lectus, tincidunt vitae est convallis, suscipit lacinia ex."));
    	card.add(new Button("Click Me!"));
    	card.addFooterComponent(new HorizontalLayout(new Paragraph("Footer"), new Button("Click Me!")));
    	card.addBottomImageComponent(new Image(imageResource, _600X200));
    	add(card);
    }
}

/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.junctions;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.junctions.JunctionEditPart;
import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.editor.ui.factory.AbstractArchimateElementUIProvider;
import com.archimatetool.model.IArchimatePackage;



/**
 * Junction UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class JunctionUIProvider extends AbstractArchimateElementUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getJunction();
    }
    
    @Override
    public EditPart createEditPart() {
        return new JunctionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.JunctionUIProvider_0;
    }
    
    @Override
    public Dimension getDefaultSize() {
        return new Dimension(15, 15);
    }

    @Override
    public Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_JUNCTION_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchimateImages.ImageFactory.getImageDescriptor(IArchimateImages.ICON_JUNCTION_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorConstants.black;
    }
    
    @Override
    public boolean shouldExposeFeature(EObject instance, EAttribute feature) {
        return false; // Junctions don't expose UI features
    }
}

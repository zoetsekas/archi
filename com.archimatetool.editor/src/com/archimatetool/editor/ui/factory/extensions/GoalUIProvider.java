/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.extensions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.extensions.GoalEditPart;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.editor.ui.factory.AbstractArchimateElementUIProvider;
import com.archimatetool.model.IArchimatePackage;



/**
 * Goal UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class GoalUIProvider extends AbstractArchimateElementUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getGoal();
    }
    
    @Override
    public EditPart createEditPart() {
        return new GoalEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.GoalUIProvider_0;
    }

    @Override
    public Image getImage() {
        return getImageWithUserFillColor(IArchimateImages.ICON_GOAL_FILLED_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return getImageDescriptorWithUserFillColor(IArchimateImages.ICON_GOAL_FILLED_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(204, 204, 255);
    }
}

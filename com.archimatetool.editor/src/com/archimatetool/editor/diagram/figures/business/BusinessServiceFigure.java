/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.diagram.figures.business;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.archimatetool.editor.diagram.figures.AbstractArchimateFigure;
import com.archimatetool.editor.diagram.figures.IFigureDelegate;
import com.archimatetool.editor.diagram.figures.RoundedRectangleFigureDelegate;
import com.archimatetool.model.IDiagramModelArchimateObject;




/**
 * Business Service Figure
 * 
 * @author Phillip Beauvoir
 */
public class BusinessServiceFigure
extends AbstractArchimateFigure {
    
    protected BusinessServiceFigureDelegate fFigureDelegate1;
    protected RoundedRectangleFigureDelegate fFigureDelegate2;

    public BusinessServiceFigure(IDiagramModelArchimateObject diagramModelObject) {
        super(diagramModelObject);

        fFigureDelegate1 = new BusinessServiceFigureDelegate(this);
        fFigureDelegate2 = new RoundedRectangleFigureDelegate(this);
    }
    
    @Override
    protected void drawFigure(Graphics graphics) {
        super.drawFigure(graphics);
        
        int type = getDiagramModelObject().getType();
        if(type == 1) {
            drawIcon(graphics);
        }
    }
    
    /**
     * Draw the icon
     */
    protected void drawIcon(Graphics graphics) {
        graphics.setLineWidth(1);
        graphics.setForegroundColor(isEnabled() ? ColorConstants.black : ColorConstants.gray);
        
        Point pt = getIconOrigin();
        Rectangle rect = new Rectangle(pt.x, pt.y, 15, 8);
        graphics.drawRoundRectangle(rect, 7, 7);
    }
    
    /**
     * @return The icon start position
     */
    protected Point getIconOrigin() {
        Rectangle bounds = getBounds();
        return new Point(bounds.x + bounds.width - 21, bounds.y + 9);
    }

    @Override
    public void refreshVisuals() {
        super.refreshVisuals();
        repaint(); // repaint when figure changes
    }

    @Override
    public IFigureDelegate getFigureDelegate() {
        int type = getDiagramModelObject().getType();
        return type == 0 ? fFigureDelegate1 : fFigureDelegate2;
    }
}

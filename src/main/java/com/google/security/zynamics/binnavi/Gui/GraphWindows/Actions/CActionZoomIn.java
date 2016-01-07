/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.GraphWindows.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import com.google.common.base.Preconditions;
import com.google.security.zynamics.binnavi.CMain;
import com.google.security.zynamics.binnavi.Gui.GraphWindows.Implementations.CGraphZoomer;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.ZyGraph;


/**
 * Action class for zooming into the graph.
 */
public final class CActionZoomIn extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 102986146385742050L;

  /**
   * Graph to be zoomed.
   */
  private final ZyGraph m_graph;

  /**
   * Creates a new action object.
   * 
   * @param graph Graph to be zoomed.
   */
  public CActionZoomIn(final ZyGraph graph) {
    super("Zoom In");
    m_graph = Preconditions.checkNotNull(graph, "IE02834: graph argument can not be null");
    putValue(Action.SHORT_DESCRIPTION, "Zoom In");
    putValue(SMALL_ICON, new ImageIcon(CMain.class.getResource("data/magnify_up.jpg")));
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    CGraphZoomer.zoomIn(m_graph);
  }
}

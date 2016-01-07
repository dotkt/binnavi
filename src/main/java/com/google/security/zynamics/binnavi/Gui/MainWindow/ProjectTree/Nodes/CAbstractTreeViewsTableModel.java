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
package com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree.Nodes;

import com.google.security.zynamics.binnavi.disassembly.views.INaviView;
import com.google.security.zynamics.zylib.gui.SwingInvoker;

import java.util.List;



/**
 * This is the base class for all table models used in tree tables that display views.
 */
public abstract class CAbstractTreeViewsTableModel extends CAbstractTreeTableModel<INaviView> {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 893536099547380185L;

  @Override
  public void fireTableDataChanged() {
    new SwingInvoker() {
      @Override
      protected void operation() {
        CAbstractTreeViewsTableModel.super.fireTableDataChanged();
      }
    }.invokeLater();
  }

  /**
   * Returns a list of all views to be shown in the table.
   * 
   * @return A list of all views to be shown in the table.
   */
  public abstract List<INaviView> getViews();

}

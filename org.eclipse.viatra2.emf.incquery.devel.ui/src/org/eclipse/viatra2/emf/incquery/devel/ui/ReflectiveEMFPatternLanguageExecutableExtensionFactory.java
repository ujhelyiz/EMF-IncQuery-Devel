package org.eclipse.viatra2.emf.incquery.devel.ui;

import hu.cubussapiens.xtext.reflectiveeditor.XtextReflectiveEditorPlugin;

import org.eclipse.viatra2.patternlanguage.ui.EMFPatternLanguageExecutableExtensionFactory;
import org.osgi.framework.Bundle;

public class ReflectiveEMFPatternLanguageExecutableExtensionFactory extends
		EMFPatternLanguageExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextReflectiveEditorPlugin.getInstance().getBundle();
	}
}

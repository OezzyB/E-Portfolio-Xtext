/*
 * generated by Xtext 2.13.0
 */
package org.example.methods.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.example.methods.ui.internal.MethodsActivator;

public class MethodsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MethodsActivator.getInstance().getInjector("org.example.methods.Methods");
	}

}

/**
 * generated by Xtext 2.26.0
 */
package org.example.domainmodel;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DomainmodelStandaloneSetup extends DomainmodelStandaloneSetupGenerated {
  public static void doSetup() {
    new DomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

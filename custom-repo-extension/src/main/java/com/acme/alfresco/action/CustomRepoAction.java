package com.acme.alfresco.action;

import org.alfresco.repo.action.executer.ActionExecuterAbstractBase;
import org.alfresco.service.cmr.action.Action;
import org.alfresco.service.cmr.action.ParameterDefinition;
import org.alfresco.service.cmr.repository.NodeRef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Custom Repository action
 *
 * @author martin.bergljung@alfresco.com
 */
public class CustomRepoAction extends ActionExecuterAbstractBase {
    private static final Logger LOG = LoggerFactory.getLogger(CustomRepoAction.class);

    @Override
    protected void addParameterDefinitions(List<ParameterDefinition> paramList) {
        // No parameters are passed to action
    }

    @Override
    protected void executeImpl(Action action, NodeRef actionedUponNodeRef) {
        System.out.println("Now, do something ...");
    }
}


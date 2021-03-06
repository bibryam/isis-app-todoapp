/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package todoapp.app.services.demoeventsubscriber;

import com.google.common.eventbus.Subscribe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.isis.applib.AbstractSubscriber;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.services.eventbus.ObjectCreatedEvent;
import org.apache.isis.applib.services.eventbus.ObjectLoadedEvent;
import org.apache.isis.applib.services.eventbus.ObjectPersistedEvent;
import org.apache.isis.applib.services.eventbus.ObjectPersistingEvent;
import org.apache.isis.applib.services.eventbus.ObjectRemovingEvent;
import org.apache.isis.applib.services.eventbus.ObjectUpdatedEvent;
import org.apache.isis.applib.services.eventbus.ObjectUpdatingEvent;

@DomainService(nature = NatureOfService.DOMAIN)
public class GenericLifecycleLoggingSubscriber extends AbstractSubscriber {

    public static final Logger LOG = LoggerFactory.getLogger(GenericLifecycleLoggingSubscriber.class);

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectCreatedEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectLoadedEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectPersistingEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectPersistedEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectUpdatingEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectUpdatedEvent ev) {
        LOG.info(ev.toString());
    }

    @Subscribe
    @org.axonframework.eventhandling.annotation.EventHandler
    public void on(final ObjectRemovingEvent ev) {
        LOG.info(ev.toString());
    }


}

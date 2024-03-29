/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.kooi.camunda;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class AutomatischeVerwerkingDelegate implements JavaDelegate {


    private final static Logger LOGGER = Logger.getLogger("AutomatischeVerwerkingsProces");

    public void execute(DelegateExecution execution) {

        String customerId = execution.getVariable("customerId") == null ? null : execution.getVariable("customerId").toString();
        String amount = execution.getVariable("amount") == null ? null : execution.getVariable("amount").toString();

        try {
            LOGGER.info("automatische verwerking is gestart");
            if (execution.getVariable("customerId") == null || execution.getVariable("amount") == null) {
                throw new Exception("Er ging iets fout");
            } else {
                LOGGER.info("automatische verwerking voor customerId " + customerId + " en amount " + amount);
            }
        } catch (Exception e) {
            throw new BpmnError("customerId of amount is niet gevuld");
        }
    }
}

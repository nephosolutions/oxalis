/*
 * Copyright (c) 2010 - 2016 Norwegian Agency for Public Government and eGovernment (Difi)
 *
 * This file is part of Oxalis.
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission
 * - subsequent versions of the EUPL (the "Licence"); You may not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl5
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the Licence
 *  is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Licence for the specific language governing permissions and limitations under the Licence.
 *
 */

package eu.peppol.identifier;

/**
 * @author steinar
 *         Date: 09.11.2016
 *         Time: 20.09
 */
public class InvalidPeppolParticipantException extends IllegalArgumentException {

    public InvalidPeppolParticipantException(String s) {
        super(s);
    }

    public InvalidPeppolParticipantException(String message, Throwable cause) {
        super(message, cause);
    }

    public static InvalidPeppolParticipantException forInputString(String s) {
        return new InvalidPeppolParticipantException("For input string: \"" + s + "\"");

    }
}
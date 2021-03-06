/*
 * Monotonicity Exploiting Association Rule Classification (MARC)
 *
 *     Copyright (C)2014-2017 Tomas Kliegr
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.kliegr.ac1.rule;

import java.util.Comparator;
import java.util.logging.Logger;

/**
 *
 * @author tomas
 */
public class PreserveRuleOrderComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        RuleInt r1 = (RuleInt) o1;
        RuleInt r2 = (RuleInt) o2;
        return r1.getRID() - r2.getRID();
    }
    private static final Logger LOG = Logger.getLogger(PreserveRuleOrderComparator.class.getName());

}

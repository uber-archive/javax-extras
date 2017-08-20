/*
 * Copyright (c) 2017. Uber Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.javaxextras;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/**
 * This annotation can be applied to a package, class or method to indicate that the class fields,
 * method return types, local variables, and parameters in that element are not null by default
 * unless:
 * - The method overrides a method in a superclass (in which case the annotation of the
 * corresponding parameter in the superclass applies).
 * - There is a default parameter annotation applied to a more tightly nested element.
 */
@Documented
@Nonnull
@TypeQualifierDefault({
    ElementType.FIELD,
    ElementType.METHOD,
    ElementType.LOCAL_VARIABLE,
    ElementType.PARAMETER
})
@Retention(RetentionPolicy.CLASS)
public @interface EverythingIsNonNullByDefault { }

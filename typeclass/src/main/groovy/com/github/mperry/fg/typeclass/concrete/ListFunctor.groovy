package com.github.mperry.fg.typeclass.concrete

import com.github.mperry.fg.typeclass.Functor
import fj.F
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 10/04/2014.
 */
@TypeChecked
class ListFunctor implements Functor<List> {

    @Override
    def <A, B> List<B> map(List<A> list, F<A, B> f) {
        list.map(f)
    }

}

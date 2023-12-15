import React from 'react'
import { inject, observer } from 'mobx-react';
import CountStore from '../../store/CountStore';

interface CountProps {
  store?: StoreType;
}

interface StoreType {
  CountStore: CountStore;
}

const CountComponent:any = inject("store")(
  observer(({ store }: CountProps) => {
    const { count, handleCount } = store!.CountStore;

    return <div>{count}</div>;
  })
) 

export default CountComponent
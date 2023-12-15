import { action, observable } from "mobx";
import { autobind } from "core-decorators";

@autobind
class CountStore {
  @observable
  count : number = 0;

  @action
  handleCount = (change: number) => {
    this.count = change;
  }
}

export default CountStore
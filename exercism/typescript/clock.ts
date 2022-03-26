/* LINK - https://exercism.org/tracks/typescript/exercises/clock */

class Clock {
    private minute: number;
    private hour: number;
    constructor(hour: number, minute?: number) {
      let addingHour: number = 0;
      if (!minute) minute = 0;
  
      if (minute < 0) {
        addingHour = Math.ceil(minute / 60) - 1;
        minute = 60 + (minute % 60);
      } else {
        addingHour = Math.floor(minute / 60);
        minute = minute % 60;
      }
  
      hour = (24 + ((hour + addingHour) % 24)) % 24;
  
      this.minute = minute;
      this.hour = hour;
    }
  
    public toString(): string {
      return (
        (this.hour < 10 ? "0" : "") +
        this.hour.toString() +
        ":" +
        (this.minute < 10 ? "0" : "") +
        this.minute.toString()
      );
    }
  
    public plus(minutes: number): Clock {
      return new Clock(this.hour, this.minute + minutes);
    }
  
    public minus(minutes: number): Clock {
      return new Clock(this.hour, this.minute - minutes);
    }
  
    public equals(other: Clock): unknown {
      if (this.hour === other.hour && this.minute === other.minute) return true;
      return false;
    }
  }
  
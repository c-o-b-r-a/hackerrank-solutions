/* LINK - https://exercism.org/tracks/typescript/exercises/leap/edit */

export function isLeap(year: number) {
  if ((!(year % 4) && year % 100) || !(year % 400)) return true;
  return false;
}

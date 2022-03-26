/* LINK - https://exercism.org/tracks/typescript/exercises/resistor-color-trio */

const colors: { [key: string]: number } = {
  black: 0,
  brown: 1,
  red: 2,
  orange: 3,
  yellow: 4,
  green: 5,
  blue: 6,
  violet: 7,
  grey: 8,
  white: 9,
};

export function decodedResistorValue(arr: string[]) {
  const [fNum, sNum, zeroNum] = [
    colors[arr[0]],
    colors[arr[1]],
    colors[arr[2]],
  ];
  const ohms = fNum * Math.pow(10, zeroNum + 1) + sNum * Math.pow(10, zeroNum);
  if (zeroNum >= 3 || (sNum == 0 && zeroNum == 2))
    return `${ohms / 1000} kiloohms`;
  return `${ohms} ohms`;
}

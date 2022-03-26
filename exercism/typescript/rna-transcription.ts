/* LINK - https://exercism.org/tracks/typescript/exercises/rna-transcription/edit */

const dnaToRna: { [key: string]: string } = {
  G: "C",
  C: "G",
  T: "A",
  A: "U",
};

export function toRna(str: string): string {
  const len: number = str.length;
  for (let i = 0; i < len; i++) {
    if (!dnaToRna[str[i]]) throw new Error("Invalid input DNA.");
    str = str.substring(0, i) + dnaToRna[str[i]] + str.substring(i + 1);
  }
  return str;
}

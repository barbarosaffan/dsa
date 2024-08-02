console.log("Time Conversion");

const sampleInput = "08:05:45AM";
const sampleOutput = "19:05:45";

function timeConversion(s: string): string {
  let res: string = "";
  const splitInput: string[] = s.split(":");
  const hr: string = splitInput[0];
  const min: string = splitInput[1];
  const splitSec = splitInput[2].split("");
  const sec: string = splitSec[0] + splitSec[1];
  const period: string = splitSec[2] + splitSec[3];

  if (period === "PM") {
    if (hr === "12") {
      res += hr + ":" + min + ":" + sec;
    } else {
      res += (parseInt(hr) + 12).toString() + ":" + min + ":" + sec;
    }
  } else {
    if (hr === "12") {
      res += "00" + ":" + min + ":" + sec;
    } else {
      res += hr + ":" + min + ":" + sec;
    }
  }

  return s;
}

timeConversion(sampleInput);

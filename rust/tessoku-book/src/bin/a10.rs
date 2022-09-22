use proconio::input;
#[proconio::fastout]
fn main() {
    input! {
        n:usize,
        a:[usize;n],
        d:usize,
        lr:[(usize,usize);d],
    }
    let mut l = vec![0; n+1];
    let mut r = vec![0; n+1];
    for i in 0..n {
        if i == 0 {
            l[i] = a[i];
        } else {
            l[i] = l[i - 1].max(a[i]);
        }
    }
    for i in (0..n).rev() {
        if i == n {
            r[i] = a[i];
        } else {
            r[i] = r[i + 1].max(a[i]);
        }
    }
    for (mut li, mut ri) in lr {
        li -= 1;
        ri -= 1;
        println!("{}", l[li - 1].max(r[ri + 1]));
    }
}

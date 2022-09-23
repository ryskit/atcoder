use proconio::input;
#[proconio::fastout]
fn main() {
    input! {
        n:i32,
        abcd:[[usize;4];n],
    }
    let max = abcd.iter().flatten().max().unwrap_or(&0);
    let mut area = vec![vec![0;max+2];max+2];
    for i in &abcd {
        area[i[0]][i[1]] += 1;
        area[i[0]][i[3]] -= 1;
        area[i[2]][i[1]] -= 1;
        area[i[2]][i[3]] += 1;
    }
    for i in 0..max+1{
        for j in 0..max+1{
            area[i][j+1] += area[i][j];
        }
    }
    for i in 0..max+1{
        for j in 0..max+1{
            area[i+1][j] += area[i][j];
        }
    }
    let mut ans = 0;
    for i in area {
        ans +=  i.iter().filter(|x| x > &&0).count();
    }
    println!("{}",ans);
}
